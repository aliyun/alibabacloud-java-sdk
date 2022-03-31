// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTracemuRequest extends TeaModel {
    // 密钥服务器uri
    @NameInMap("KeyUri")
    public String keyUri;

    // ab流处理后的媒体id
    @NameInMap("MediaId")
    public String mediaId;

    // m3u8文件输出oss地址
    @NameInMap("Output")
    public String output;

    // 溯源水印信息
    @NameInMap("Trace")
    public String trace;

    public static SubmitTracemuRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTracemuRequest self = new SubmitTracemuRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTracemuRequest setKeyUri(String keyUri) {
        this.keyUri = keyUri;
        return this;
    }
    public String getKeyUri() {
        return this.keyUri;
    }

    public SubmitTracemuRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitTracemuRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitTracemuRequest setTrace(String trace) {
        this.trace = trace;
        return this;
    }
    public String getTrace() {
        return this.trace;
    }

}
