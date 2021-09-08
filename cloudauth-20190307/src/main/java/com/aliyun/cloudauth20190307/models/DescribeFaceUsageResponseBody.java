// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceUsageResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FaceUsageList")
    public java.util.List<DescribeFaceUsageResponseBodyFaceUsageList> faceUsageList;

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

    public DescribeFaceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaceUsageResponseBody setFaceUsageList(java.util.List<DescribeFaceUsageResponseBodyFaceUsageList> faceUsageList) {
        this.faceUsageList = faceUsageList;
        return this;
    }
    public java.util.List<DescribeFaceUsageResponseBodyFaceUsageList> getFaceUsageList() {
        return this.faceUsageList;
    }

    public static class DescribeFaceUsageResponseBodyFaceUsageList extends TeaModel {
        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Date")
        public String date;

        public static DescribeFaceUsageResponseBodyFaceUsageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaceUsageResponseBodyFaceUsageList self = new DescribeFaceUsageResponseBodyFaceUsageList();
            return TeaModel.build(map, self);
        }

        public DescribeFaceUsageResponseBodyFaceUsageList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public DescribeFaceUsageResponseBodyFaceUsageList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

}
