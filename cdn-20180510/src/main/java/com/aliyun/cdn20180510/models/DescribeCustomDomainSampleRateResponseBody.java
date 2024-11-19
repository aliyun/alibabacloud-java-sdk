// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCustomDomainSampleRateResponseBody extends TeaModel {
    @NameInMap("Content")
    public DescribeCustomDomainSampleRateResponseBodyContent content;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCustomDomainSampleRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDomainSampleRateResponseBody self = new DescribeCustomDomainSampleRateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDomainSampleRateResponseBody setContent(DescribeCustomDomainSampleRateResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeCustomDomainSampleRateResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeCustomDomainSampleRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCustomDomainSampleRateResponseBodyContentDomainContent extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("SampleRate")
        public Float sampleRate;

        public static DescribeCustomDomainSampleRateResponseBodyContentDomainContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDomainSampleRateResponseBodyContentDomainContent self = new DescribeCustomDomainSampleRateResponseBodyContentDomainContent();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDomainSampleRateResponseBodyContentDomainContent setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeCustomDomainSampleRateResponseBodyContentDomainContent setSampleRate(Float sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Float getSampleRate() {
            return this.sampleRate;
        }

    }

    public static class DescribeCustomDomainSampleRateResponseBodyContent extends TeaModel {
        @NameInMap("DomainContent")
        public java.util.List<DescribeCustomDomainSampleRateResponseBodyContentDomainContent> domainContent;

        public static DescribeCustomDomainSampleRateResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomDomainSampleRateResponseBodyContent self = new DescribeCustomDomainSampleRateResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeCustomDomainSampleRateResponseBodyContent setDomainContent(java.util.List<DescribeCustomDomainSampleRateResponseBodyContentDomainContent> domainContent) {
            this.domainContent = domainContent;
            return this;
        }
        public java.util.List<DescribeCustomDomainSampleRateResponseBodyContentDomainContent> getDomainContent() {
            return this.domainContent;
        }

    }

}
