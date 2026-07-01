// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSportsHighlightsJobRequest extends TeaModel {
    /**
     * <p>A client-generated token to ensure request idempotency.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The input configuration. For more information, see <a href="~~2843158#5cbc796a9cuu8~~">input configuration parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;SportsCategory&quot;: &quot;basketball&quot;,
     *   &quot;InputMedia&quot;: &quot;<a href="http://test-bucket.oss-cn-******.basketball-0707.mp4">http://test-bucket.oss-cn-******.basketball-0707.mp4</a>&quot;,
     *   &quot;FaceRegister&quot;: [
     *     {
     *       &quot;FaceUrls&quot;: [&quot;<a href="http://testcdn.com/front.jpg">http://testcdn.com/front.jpg</a>&quot;, &quot;<a href="http://testcdn.com/side.jpg%22%5D">http://testcdn.com/side.jpg&quot;]</a>,
     *       &quot;Name&quot;: &quot;James&quot;
     *     }
     *   ],
     *   &quot;SlowMotionLogoRegister&quot;: {
     *       &quot;SlowMotionLogoUrls&quot;: [&quot;<a href="http://testcdn.com/logo1.jpg">http://testcdn.com/logo1.jpg</a>&quot;, &quot;<a href="http://testcdn.com/logo2.jpg%22%5D">http://testcdn.com/logo2.jpg&quot;]</a>
     *   },
     *   &quot;TransferNameRegister&quot;: [
     *     {
     *       &quot;OriginalName&quot;: &quot;IND&quot;,
     *       &quot;TransferName&quot;: &quot;印第安纳步行者&quot;
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>The output configuration. For more information, see <a href="~~2843158#b7dad99fe5q0r~~">output configuration parameters</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;MediaURL&quot;: &quot;<a href="http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
     *   &quot;Count&quot;: 1,
     *   &quot;Width&quot;: 1080,
     *   &quot;Height&quot;: 1920
     * }</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <p>The user data, containing business and callback configurations. For more information about the structure, see <a href="https://help.aliyun.com/document_detail/357745.html">user data configuration</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitSportsHighlightsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSportsHighlightsJobRequest self = new SubmitSportsHighlightsJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSportsHighlightsJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitSportsHighlightsJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitSportsHighlightsJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitSportsHighlightsJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
