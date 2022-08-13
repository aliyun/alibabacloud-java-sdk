// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppCcuResponseBody extends TeaModel {
    @NameInMap("DetailList")
    public java.util.List<GetAppCcuResponseBodyDetailList> detailList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Timestamp")
    public String timestamp;

    public static GetAppCcuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppCcuResponseBody self = new GetAppCcuResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppCcuResponseBody setDetailList(java.util.List<GetAppCcuResponseBodyDetailList> detailList) {
        this.detailList = detailList;
        return this;
    }
    public java.util.List<GetAppCcuResponseBodyDetailList> getDetailList() {
        return this.detailList;
    }

    public GetAppCcuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppCcuResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public static class GetAppCcuResponseBodyDetailList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Ccu")
        public String ccu;

        @NameInMap("DistrictId")
        public String districtId;

        @NameInMap("ProjectId")
        public String projectId;

        public static GetAppCcuResponseBodyDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetAppCcuResponseBodyDetailList self = new GetAppCcuResponseBodyDetailList();
            return TeaModel.build(map, self);
        }

        public GetAppCcuResponseBodyDetailList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAppCcuResponseBodyDetailList setCcu(String ccu) {
            this.ccu = ccu;
            return this;
        }
        public String getCcu() {
            return this.ccu;
        }

        public GetAppCcuResponseBodyDetailList setDistrictId(String districtId) {
            this.districtId = districtId;
            return this;
        }
        public String getDistrictId() {
            return this.districtId;
        }

        public GetAppCcuResponseBodyDetailList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
