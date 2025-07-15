// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeStreamNumResponseBody extends TeaModel {
    /**
     * <p>The number of streams for which transcoding is triggered by stream pulling.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("LazyTranscodedNumber")
    public Long lazyTranscodedNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>150191A4-DD88-5941-B48C-9DF59E0A8B1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of streams.</p>
     * 
     * <strong>example:</strong>
     * <p>57</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <p>The details about the transcoding templates.</p>
     */
    @NameInMap("TranscodeStreamCountDetails")
    public java.util.List<DescribeLiveStreamTranscodeStreamNumResponseBodyTranscodeStreamCountDetails> transcodeStreamCountDetails;

    /**
     * <p>The number of streams that are transcoded.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TranscodedNumber")
    public Long transcodedNumber;

    /**
     * <p>The number of streams that are not transcoded.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("UntranscodeNumber")
    public Long untranscodeNumber;

    public static DescribeLiveStreamTranscodeStreamNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeStreamNumResponseBody self = new DescribeLiveStreamTranscodeStreamNumResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setLazyTranscodedNumber(Long lazyTranscodedNumber) {
        this.lazyTranscodedNumber = lazyTranscodedNumber;
        return this;
    }
    public Long getLazyTranscodedNumber() {
        return this.lazyTranscodedNumber;
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setTranscodeStreamCountDetails(java.util.List<DescribeLiveStreamTranscodeStreamNumResponseBodyTranscodeStreamCountDetails> transcodeStreamCountDetails) {
        this.transcodeStreamCountDetails = transcodeStreamCountDetails;
        return this;
    }
    public java.util.List<DescribeLiveStreamTranscodeStreamNumResponseBodyTranscodeStreamCountDetails> getTranscodeStreamCountDetails() {
        return this.transcodeStreamCountDetails;
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setTranscodedNumber(Long transcodedNumber) {
        this.transcodedNumber = transcodedNumber;
        return this;
    }
    public Long getTranscodedNumber() {
        return this.transcodedNumber;
    }

    public DescribeLiveStreamTranscodeStreamNumResponseBody setUntranscodeNumber(Long untranscodeNumber) {
        this.untranscodeNumber = untranscodeNumber;
        return this;
    }
    public Long getUntranscodeNumber() {
        return this.untranscodeNumber;
    }

    public static class DescribeLiveStreamTranscodeStreamNumResponseBodyTranscodeStreamCountDetails extends TeaModel {
        /**
         * <p>The number of streams that use the transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The name of the transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p>template_name</p>
         */
        @NameInMap("Template")
        public String template;

        public static DescribeLiveStreamTranscodeStreamNumResponseBodyTranscodeStreamCountDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeStreamNumResponseBodyTranscodeStreamCountDetails self = new DescribeLiveStreamTranscodeStreamNumResponseBodyTranscodeStreamCountDetails();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeStreamNumResponseBodyTranscodeStreamCountDetails setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeLiveStreamTranscodeStreamNumResponseBodyTranscodeStreamCountDetails setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

    }

}
