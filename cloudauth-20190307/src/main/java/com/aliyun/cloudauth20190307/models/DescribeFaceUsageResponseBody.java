// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceUsageResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("FaceUsageList")
    public java.util.List<DescribeFaceUsageResponseBodyFaceUsageList> faceUsageList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFaceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceUsageResponseBody self = new DescribeFaceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaceUsageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeFaceUsageResponseBody setFaceUsageList(java.util.List<DescribeFaceUsageResponseBodyFaceUsageList> faceUsageList) {
        this.faceUsageList = faceUsageList;
        return this;
    }
    public java.util.List<DescribeFaceUsageResponseBodyFaceUsageList> getFaceUsageList() {
        return this.faceUsageList;
    }

    public DescribeFaceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFaceUsageResponseBodyFaceUsageList extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeFaceUsageResponseBodyFaceUsageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaceUsageResponseBodyFaceUsageList self = new DescribeFaceUsageResponseBodyFaceUsageList();
            return TeaModel.build(map, self);
        }

        public DescribeFaceUsageResponseBodyFaceUsageList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeFaceUsageResponseBodyFaceUsageList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
