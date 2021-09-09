// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceUsageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("FaceUsageList")
    @Validation(required = true)
    public java.util.List<DescribeFaceUsageResponseFaceUsageList> faceUsageList;

    public static DescribeFaceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceUsageResponse self = new DescribeFaceUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFaceUsageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaceUsageResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeFaceUsageResponse setFaceUsageList(java.util.List<DescribeFaceUsageResponseFaceUsageList> faceUsageList) {
        this.faceUsageList = faceUsageList;
        return this;
    }
    public java.util.List<DescribeFaceUsageResponseFaceUsageList> getFaceUsageList() {
        return this.faceUsageList;
    }

    public static class DescribeFaceUsageResponseFaceUsageList extends TeaModel {
        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        public static DescribeFaceUsageResponseFaceUsageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaceUsageResponseFaceUsageList self = new DescribeFaceUsageResponseFaceUsageList();
            return TeaModel.build(map, self);
        }

        public DescribeFaceUsageResponseFaceUsageList setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeFaceUsageResponseFaceUsageList setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
