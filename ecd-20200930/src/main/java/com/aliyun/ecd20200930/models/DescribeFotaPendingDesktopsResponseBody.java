// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaPendingDesktopsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The cloud computers whose images can be and are pending to be updated to the version specified in <code>TaskUid</code>.</p>
     */
    @NameInMap("FotaPendingDesktops")
    public java.util.List<DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktops> fotaPendingDesktops;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
        /**
         * <p>The ID of the end user that connects to the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>end user id</p>
         */
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
         * <p>The current version of the image used by the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1-D-20220513.143129</p>
         */
        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        /**
         * <p>The ID of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-bvdtu3jn97o1r****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>TestDesktop</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>To be hidden</p>
         */
        @NameInMap("FotaProject")
        public String fotaProject;

        /**
         * <p>The ID of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-815419****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The connected sessions.</p>
         */
        @NameInMap("Sessions")
        public java.util.List<DescribeFotaPendingDesktopsResponseBodyFotaPendingDesktopsSessions> sessions;

        /**
         * <p>The status of the cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: The cloud computer is being created.</li>
         * <li>1: The cloud computer is being started.</li>
         * <li>2: The cloud computer is running.</li>
         * <li>3: The cloud computer is being stopped.</li>
         * <li>5: The cloud computer is stopped.</li>
         * <li>6: The cloud computer expires.</li>
         * <li>7: The cloud computer is deleted.</li>
         * <li>9: Failed to create the cloud computer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
