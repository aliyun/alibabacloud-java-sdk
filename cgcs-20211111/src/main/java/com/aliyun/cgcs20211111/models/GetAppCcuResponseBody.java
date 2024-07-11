// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppCcuResponseBody extends TeaModel {
    @NameInMap("DetailList")
    public java.util.List<GetAppCcuResponseBodyDetailList> detailList;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>13027****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>35067****</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Ccu")
        public String ccu;

        /**
         * <strong>example:</strong>
         * <p>huadong</p>
         */
        @NameInMap("DistrictId")
        public String districtId;

        /**
         * <strong>example:</strong>
         * <p>d9a8****</p>
         */
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

        public GetAppCcuResponseBodyDetailList setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
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
