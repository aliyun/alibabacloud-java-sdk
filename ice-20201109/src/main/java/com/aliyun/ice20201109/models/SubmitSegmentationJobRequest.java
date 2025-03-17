// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSegmentationJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;Mode&quot;: &quot;UserDefined&quot;,
     *     &quot;Ranges&quot;: [{
     *         &quot;In&quot;: 10,
     *         &quot;Out&quot;: 20
     *     }, {
     *         &quot;In&quot;: 35,
     *         &quot;Out&quot;: 50
     *     }]
     * }</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;OutputMediaTarget&quot;: &quot;oss-object&quot;,
     *     &quot;Bucket&quot;: &quot;test-bucket&quot;,
     *     &quot;ObjectKey&quot;: &quot;path/to/test_{index}.mp4&quot;,
     *     &quot;Width&quot;: 1920,
     *     &quot;Height&quot;: 1080,
     *     &quot;ExportAsNewMedia&quot;: false
     * }</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("UserData")
    public String userData;

    public static SubmitSegmentationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSegmentationJobRequest self = new SubmitSegmentationJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSegmentationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitSegmentationJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitSegmentationJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitSegmentationJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitSegmentationJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
