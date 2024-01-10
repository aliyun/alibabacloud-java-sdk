// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTracemuRequest extends TeaModel {
    @NameInMap("KeyUri")
    public String keyUri;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("Output")
    public String output;

    @NameInMap("Params")
    public String params;

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

    public SubmitTracemuRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitTracemuRequest setTrace(String trace) {
        this.trace = trace;
        return this;
    }
    public String getTrace() {
        return this.trace;
    }

}
