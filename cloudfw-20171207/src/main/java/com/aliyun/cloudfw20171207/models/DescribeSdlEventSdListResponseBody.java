// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSdlEventSdListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>15FCCC52-1E23-57AE-B5EF-3E00A3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SdlEventSensitiveDataList")
    public java.util.List<DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList> sdlEventSensitiveDataList;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSdlEventSdListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSdlEventSdListResponseBody self = new DescribeSdlEventSdListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSdlEventSdListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSdlEventSdListResponseBody setSdlEventSensitiveDataList(java.util.List<DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList> sdlEventSensitiveDataList) {
        this.sdlEventSensitiveDataList = sdlEventSensitiveDataList;
        return this;
    }
    public java.util.List<DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList> getSdlEventSensitiveDataList() {
        return this.sdlEventSensitiveDataList;
    }

    public DescribeSdlEventSdListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sk-N***************************SxiJ</p>
         */
        @NameInMap("SensitiveData")
        public String sensitiveData;

        /**
         * <strong>example:</strong>
         * <p>6</p>
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
         * <p>172.23.191.XXX</p>
         */
        @NameInMap("SrcIp")
        public String srcIp;

        /**
         * <strong>example:</strong>
         * <p>1753928907</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList self = new DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList();
            return TeaModel.build(map, self);
        }

        public DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList setSensitiveData(String sensitiveData) {
            this.sensitiveData = sensitiveData;
            return this;
        }
        public String getSensitiveData() {
            return this.sensitiveData;
        }

        public DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList setSensitiveDataCnt(Long sensitiveDataCnt) {
            this.sensitiveDataCnt = sensitiveDataCnt;
            return this;
        }
        public Long getSensitiveDataCnt() {
            return this.sensitiveDataCnt;
        }

        public DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList setSensitiveLevel(String sensitiveLevel) {
            this.sensitiveLevel = sensitiveLevel;
            return this;
        }
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        public DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList setSensitiveType(String sensitiveType) {
            this.sensitiveType = sensitiveType;
            return this;
        }
        public String getSensitiveType() {
            return this.sensitiveType;
        }

        public DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

        public DescribeSdlEventSdListResponseBodySdlEventSensitiveDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
