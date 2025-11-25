// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlEventDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D19D8F70-D64B-5A95-905A-6073BF4A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SdlEventDetailList")
    public java.util.List<DescribeSdlEventDetailResponseBodySdlEventDetailList> sdlEventDetailList;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSdlEventDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlEventDetailResponseBody self = new DescribeSdlEventDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSdlEventDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSdlEventDetailResponseBody setSdlEventDetailList(java.util.List<DescribeSdlEventDetailResponseBodySdlEventDetailList> sdlEventDetailList) {
        this.sdlEventDetailList = sdlEventDetailList;
        return this;
    }
    public java.util.List<DescribeSdlEventDetailResponseBodySdlEventDetailList> getSdlEventDetailList() {
        return this.sdlEventDetailList;
    }

    public DescribeSdlEventDetailResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSdlEventDetailResponseBodySdlEventDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>event-test</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SensitiveDataCnt")
        public Long sensitiveDataCnt;

        /**
         * <strong>example:</strong>
         * <p>S3</p>
         */
        @NameInMap("SensitiveLevel")
        public String sensitiveLevel;

        @NameInMap("SensitiveType")
        public String sensitiveType;

        /**
         * <strong>example:</strong>
         * <p>1753928907</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeSdlEventDetailResponseBodySdlEventDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSdlEventDetailResponseBodySdlEventDetailList self = new DescribeSdlEventDetailResponseBodySdlEventDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeSdlEventDetailResponseBodySdlEventDetailList setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeSdlEventDetailResponseBodySdlEventDetailList setSensitiveDataCnt(Long sensitiveDataCnt) {
            this.sensitiveDataCnt = sensitiveDataCnt;
            return this;
        }
        public Long getSensitiveDataCnt() {
            return this.sensitiveDataCnt;
        }

        public DescribeSdlEventDetailResponseBodySdlEventDetailList setSensitiveLevel(String sensitiveLevel) {
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        public DescribeSdlEventDetailResponseBodySdlEventDetailList setSensitiveType(String sensitiveType) {
            this.sensitiveType = sensitiveType;
            return this;
        }
        public String getSensitiveType() {
            return this.sensitiveType;
        }

        public DescribeSdlEventDetailResponseBodySdlEventDetailList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
