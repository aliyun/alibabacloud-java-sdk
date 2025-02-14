// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitHighlightExtractionJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;MediaArray&quot;: [{
     *         &quot;MediaId&quot;: &quot;ceb72f00e<strong><strong>1ef8216e7e6c64a6302&quot;
     *     }, {
     *         &quot;MediaId&quot;: &quot;ce450c40e</strong></strong>1ef8216e7e6c64a6302&quot;
     *     }, {
     *         &quot;MediaId&quot;: &quot;ce49a020e<strong><strong>1ef81c1e6f6d5686302&quot;
     *     }, {
     *         &quot;MediaId&quot;: &quot;d047e120e</strong></strong>1ef81c1e6f6d5686302&quot;
     *     }, {
     *         &quot;MediaId&quot;: &quot;cfe2ddc0e****1ef81c1e6f6d5686302&quot;
     *     }],
     *     &quot;Strategy&quot;: {
     *         &quot;Count&quot;: 5,
     *         &quot;ClipDuration&quot;: 15
     *     }
     * }</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;NeedExport&quot;: true,
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

    public static SubmitHighlightExtractionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitHighlightExtractionJobRequest self = new SubmitHighlightExtractionJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitHighlightExtractionJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitHighlightExtractionJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitHighlightExtractionJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitHighlightExtractionJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
