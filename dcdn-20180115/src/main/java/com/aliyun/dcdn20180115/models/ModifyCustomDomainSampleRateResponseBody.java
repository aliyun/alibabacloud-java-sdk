// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyCustomDomainSampleRateResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<ModifyCustomDomainSampleRateResponseBodyContent> content;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCustomDomainSampleRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomDomainSampleRateResponseBody self = new ModifyCustomDomainSampleRateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCustomDomainSampleRateResponseBody setContent(java.util.List<ModifyCustomDomainSampleRateResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ModifyCustomDomainSampleRateResponseBodyContent> getContent() {
        return this.content;
    }

    public ModifyCustomDomainSampleRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyCustomDomainSampleRateResponseBodyContent extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("ErrMessage")
        public String errMessage;

        @NameInMap("SampleRate")
        public Float sampleRate;

        public static ModifyCustomDomainSampleRateResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomDomainSampleRateResponseBodyContent self = new ModifyCustomDomainSampleRateResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ModifyCustomDomainSampleRateResponseBodyContent setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ModifyCustomDomainSampleRateResponseBodyContent setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public ModifyCustomDomainSampleRateResponseBodyContent setSampleRate(Float sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Float getSampleRate() {
            return this.sampleRate;
        }

    }

}
