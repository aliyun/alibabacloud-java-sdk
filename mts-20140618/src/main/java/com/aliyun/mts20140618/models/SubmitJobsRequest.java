// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitJobsRequest extends TeaModel {
    /**
     * <p>The information about the input file. For more information, see the &quot;Input&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The path of an Object Storage Service (OSS) object must be URL-encoded in UTF-8 before you use the path in MPS.</p>
     * </li>
     * <li><p>The OSS bucket must reside in the same region as your MPS service.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a/b/c/test-cn.srt</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The name of the OSS bucket that stores the output file.</p>
     * <ul>
     * <li>For more information about the term bucket, see <a href="https://help.aliyun.com/document_detail/31827.html">Terms</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleBucket</p>
     */
    @NameInMap("OutputBucket")
    public String outputBucket;

    /**
     * <p>The region in which the OSS bucket that stores the output file resides.</p>
     * <ul>
     * <li>The OSS bucket must reside in the same region as MPS.</li>
     * <li>For more information about the term bucket, see <a href="https://help.aliyun.com/document_detail/31827.html">Terms</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou</p>
     */
    @NameInMap("OutputLocation")
    public String outputLocation;

    /**
     * <p>The job output configurations. For more information, see the &quot;Output&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
     * <ul>
     * <li>Specify the value in a JSON array of Output objects. You can specify up to 30 Output objects.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;OutputObject&quot;:&quot;exampleOutput.mp4&quot;,&quot;TemplateId&quot;:&quot;6181666213ab41b9bc21da8ff5ff****&quot;,&quot;WaterMarks&quot;:[{&quot;InputFile&quot;:{&quot;Bucket&quot;:&quot;exampleBucket&quot;,&quot;Location&quot;:&quot;oss-cn-hangzhou&quot;,&quot;Object&quot;:&quot;image_01.png&quot;},&quot;WaterMarkTemplateId&quot;:&quot;9b772ce2740d4d55876d8b542d47****&quot;}],&quot;UserData&quot;:&quot;testid-001&quot;}]</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue. For more information, see <a href="https://help.aliyun.com/document_detail/31827.html">Terms</a>.</p>
     * <ul>
     * <li>To obtain the ID of an MPS queue, you can log on to the <a href="https://mps.console.aliyun.com/overview">MPS console</a> and choose <strong>Global Settings</strong> &gt; <strong>MPS Queue and Callback</strong> in the left-side navigation pane.</li>
     * <li>If you want to receive asynchronous message notifications, associate an MNS queue or topic with the MPS queue. For more information, see <a href="https://www.alibabacloud.com/help/zh/apsaravideo-for-media-processing/latest/receive-message-notifications">Receive notifications</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dd3dae411e704030b921e52698e5****</p>
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
