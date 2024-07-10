// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitTraceExtractJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("CallBack")
    public String callBack;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example.mp4&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <strong>example:</strong>
     * <p>{&quot;m3u8Type&quot;:&quot;v1&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/video/test.mp4">http://www.example.com/video/test.mp4</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitTraceExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceExtractJobRequest self = new SubmitTraceExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTraceExtractJobRequest setCallBack(String callBack) {
        this.callBack = callBack;
        return this;
    }
    public String getCallBack() {
        return this.callBack;
    }

    public SubmitTraceExtractJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitTraceExtractJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitTraceExtractJobRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public SubmitTraceExtractJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
