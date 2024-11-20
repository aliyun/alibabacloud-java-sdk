// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsMpsAiUsageResponseBody extends TeaModel {
    /**
     * <p>The usage statistics of IMS on AI processing of MPS.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeMeterImsMpsAiUsageResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0622C702-41BE-467E-AF2E-883D4517962E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterImsMpsAiUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsMpsAiUsageResponseBody self = new DescribeMeterImsMpsAiUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsMpsAiUsageResponseBody setData(java.util.List<DescribeMeterImsMpsAiUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterImsMpsAiUsageResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterImsMpsAiUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterImsMpsAiUsageResponseBodyData extends TeaModel {
        /**
         * <p>The usage duration, in minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>644</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The beginning time of usage. The value is a 10-digit timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1656950400</p>
         */
        @NameInMap("Time")
        public Long time;

        /**
         * <p>The AI type. Valid values:</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeMeterImsMpsAiUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterImsMpsAiUsageResponseBodyData self = new DescribeMeterImsMpsAiUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterImsMpsAiUsageResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeMeterImsMpsAiUsageResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeMeterImsMpsAiUsageResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
