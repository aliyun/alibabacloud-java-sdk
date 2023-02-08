// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitJobsRequest extends TeaModel {
    /**
     * <p>The input of the jobs. Specify the value in a JSON object. Referer is an optional parameter. If you need to set a referer whitelist in a transcoding job, you must set the Referer parameter in the input. For more information about the fields in the Input parameter, see [Input](~~29253~~).</p>
     * <br>
     * <p>>  You can specify the `{ObjectPrefix}`, `{FileName}`, and `{ExtName}` variables in an OSS URL. MPS can dynamically replace the variables with the actual values. For example, if you specify `a/b/c/test.flv` as the object to be used as the input file and `{ObjectPrefix}{FileName}-cn.srt` as the object to be used as the external subtitle file, MPS replaces the variables to obtain the OSS URL a/b/c/test-cn.srt of the external subtitle file. The OSS URL that you specify must be URL-encoded. Therefore, you must specify the OSS URL of the external subtitle file as `%7bObjectPrefix%7d%7bFileName%7d-cn.srt`. Therefore, you must specify the OSS URL of the external subtitle file as `a/b/c/test-cn.srt`.</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The name of the output bucket. To obtain the name of an output bucket, you can log on to the [MPS console](https://mps.console.aliyun.com/overview) and choose **Workflows** > **Media Buckets** in the left-side navigation pane.</p>
     */
    @NameInMap("OutputBucket")
    public String outputBucket;

    /**
     * <p>The region in which the output bucket resides.</p>
     */
    @NameInMap("OutputLocation")
    public String outputLocation;

    /**
     * <p>The outputs of the jobs.</p>
     * <br>
     * <p>*   Specify the value in a JSON array of Output objects. You can specify up to 30 Output objects.</p>
     * <p>*   For more information about job outputs, see [Terms](~~29212~~).</p>
     * <p>*   For more information about the fields in each Output object, see [Output](~~29253~~).</p>
     * <br>
     * <p>>  If you need to merge images in a transcoding job, set the width and height of each image to be processed to even numbers. Otherwise, the job may fail.</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue. To obtain the ID of an MPS queue, you can log on to the [MPS console](https://mps.console.aliyun.com/overview) and choose **Global Settings** > **Pipelines** in the left-side navigation pane.</p>
     * <br>
     * <p>*   For more information about MPS queues, see [Terms](~~29212~~).</p>
     * <p>*   If you want to use asynchronous notifications, make sure that an MNS topic is bound to the MPS queue to be used. For more information about how to bind an MNS topic to an MPS queue, see [Enable the feature for sending notifications on transcoding jobs](~~51469~~).</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SubmitJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobsRequest self = new SubmitJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitJobsRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitJobsRequest setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
        return this;
    }
    public String getOutputBucket() {
        return this.outputBucket;
    }

    public SubmitJobsRequest setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }
    public String getOutputLocation() {
        return this.outputLocation;
    }

    public SubmitJobsRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public SubmitJobsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitJobsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitJobsRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitJobsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitJobsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
