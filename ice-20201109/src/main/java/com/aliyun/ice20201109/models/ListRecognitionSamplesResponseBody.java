// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListRecognitionSamplesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>xxx-xxxx-xxxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Samples")
    public ListRecognitionSamplesResponseBodySamples samples;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRecognitionSamplesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecognitionSamplesResponseBody self = new ListRecognitionSamplesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecognitionSamplesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecognitionSamplesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecognitionSamplesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecognitionSamplesResponseBody setSamples(ListRecognitionSamplesResponseBodySamples samples) {
        this.samples = samples;
        return this;
    }
    public ListRecognitionSamplesResponseBodySamples getSamples() {
        return this.samples;
    }

    public ListRecognitionSamplesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRecognitionSamplesResponseBodySamplesSample extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/sample.png">https://example.com/sample.png</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <strong>example:</strong>
         * <p>xxxxxxxxxxxxx</p>
         */
        @NameInMap("SampleId")
        public String sampleId;

        public static ListRecognitionSamplesResponseBodySamplesSample build(java.util.Map<String, ?> map) throws Exception {
            ListRecognitionSamplesResponseBodySamplesSample self = new ListRecognitionSamplesResponseBodySamplesSample();
            return TeaModel.build(map, self);
        }

        public ListRecognitionSamplesResponseBodySamplesSample setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public ListRecognitionSamplesResponseBodySamplesSample setSampleId(String sampleId) {
            this.sampleId = sampleId;
            return this;
        }
        public String getSampleId() {
            return this.sampleId;
        }

    }

    public static class ListRecognitionSamplesResponseBodySamples extends TeaModel {
        @NameInMap("Sample")
        public java.util.List<ListRecognitionSamplesResponseBodySamplesSample> sample;

        public static ListRecognitionSamplesResponseBodySamples build(java.util.Map<String, ?> map) throws Exception {
            ListRecognitionSamplesResponseBodySamples self = new ListRecognitionSamplesResponseBodySamples();
            return TeaModel.build(map, self);
        }

        public ListRecognitionSamplesResponseBodySamples setSample(java.util.List<ListRecognitionSamplesResponseBodySamplesSample> sample) {
            this.sample = sample;
            return this;
        }
        public java.util.List<ListRecognitionSamplesResponseBodySamplesSample> getSample() {
            return this.sample;
        }

    }

}
