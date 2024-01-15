// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaPendingDesktopsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>Details about the cloud desktops whose images can be but are not yet updated to the version that is described in an image update task (TaskUid).</p>
     */
    @NameInMap("FotaPendingDesktops")
    public java.util.List<DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops> fotaPendingDesktops;

    @NameInMap("Message")
    public String message;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the NextToken parameter is empty, no next page exists.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFotaPendingDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFotaPendingDesktopsResponseBody self = new DescribeFotaPendingDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFotaPendingDesktopsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeFotaPendingDesktopsResponseBody setFotaPendingDesktops(java.util.List<DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops> fotaPendingDesktops) {
        this.fotaPendingDesktops = fotaPendingDesktops;
        return this;
    }
    public java.util.List<DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops> getFotaPendingDesktops() {
        return this.fotaPendingDesktops;
    }

    public DescribeFotaPendingDesktopsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFotaPendingDesktopsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFotaPendingDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktopsSessions extends TeaModel {
        @NameInMap("EndUserId")
        public String endUserId;

        public static DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktopsSessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktopsSessions self = new DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktopsSessions();
            return TeaModel.build(map, self);
        }

        public DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktopsSessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

    }

    public static class DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops extends TeaModel {
        /**
         * <p>The current version of the image used by the cloud desktop.</p>
         */
        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        /**
         * <p>The cloud desktop ID.</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The cloud desktop name.</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("FotaProject")
        public String fotaProject;

        /**
         * <p>The workspace ID.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("Sessions")
        public java.util.List<DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktopsSessions> sessions;

        @NameInMap("Status")
        public Long status;

        public static DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops self = new DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops setCurrentAppVersion(String currentAppVersion) {
            this.currentAppVersion = currentAppVersion;
            return this;
        }
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        public DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops setFotaProject(String fotaProject) {
            this.fotaProject = fotaProject;
            return this;
        }
        public String getFotaProject() {
            return this.fotaProject;
        }

        public DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops setSessions(java.util.List<DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktopsSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktopsSessions> getSessions() {
            return this.sessions;
        }

        public DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

}
