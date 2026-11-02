// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaAiAnalysisJobRequest extends TeaModel {
    /**
     * <p>The media asset analysis parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;nlpParams&quot;:{&quot;sourceLanguage&quot;:&quot;cn&quot;,&quot;diarizationEnabled&quot;:true,&quot;speakerCount&quot;:0,&quot;summarizationEnabled&quot;:false,&quot;translationEnabled&quot;:false}}</p>
     */
    @NameInMap("AnalysisParams")
    public String analysisParams;

    /**
     * <p>The input media. Only OSS URLs and media asset IDs in the same region are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaType&quot;:&quot;video&quot;,&quot;Media&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/your_movie.mp4%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/your_movie.mp4&quot;}</a>
     * or
     * {&quot;Type&quot;:&quot;Media&quot;,&quot;Media&quot;:&quot;adbf5a778175ee757c34d0eba4******&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The custom settings in JSON format. The maximum length is 512 bytes. <a href="https://help.aliyun.com/document_detail/451631.html">Custom callback URL configuration</a> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="https://xx.com/xx%22%7D">https://xx.com/xx&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitMediaAiAnalysisJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaAiAnalysisJobRequest self = new SubmitMediaAiAnalysisJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaAiAnalysisJobRequest setAnalysisParams(String analysisParams) {
        this.analysisParams = analysisParams;
        return this;
    }
    public String getAnalysisParams() {
        return this.analysisParams;
    }

    public SubmitMediaAiAnalysisJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitMediaAiAnalysisJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
