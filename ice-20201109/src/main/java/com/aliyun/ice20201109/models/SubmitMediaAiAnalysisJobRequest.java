// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitMediaAiAnalysisJobRequest extends TeaModel {
    /**
     * <p>The analysis parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;nlpParams&quot;:{&quot;sourceLanguage&quot;:&quot;cn&quot;,&quot;diarizationEnabled&quot;:true,&quot;speakerCount&quot;:0,&quot;summarizationEnabled&quot;:false,&quot;translationEnabled&quot;:false}}</p>
     */
    @NameInMap("AnalysisParams")
    public String analysisParams;

    /**
     * <p>The media asset that you want to analyze. You can specify an Object Storage Service (OSS) URL, a media asset ID, or an external URL.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaType&quot;:&quot;video&quot;,&quot;Media&quot;:&quot;<a href="https://xxx.com/your_movie.mp4%22%7D">https://xxx.com/your_movie.mp4&quot;}</a></p>
     */
    @NameInMap("Input")
    public String input;

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

}
