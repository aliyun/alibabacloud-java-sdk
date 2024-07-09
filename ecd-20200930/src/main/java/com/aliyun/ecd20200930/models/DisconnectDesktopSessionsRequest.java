// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DisconnectDesktopSessionsRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform precheck. If you perform precheck, the system does not disconnect from desktop sessions. Only the sessions that do not meet specific conditions are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PreCheck")
    public Boolean preCheck;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The session details.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Sessions")
    public java.util.List<DisconnectDesktopSessionsRequestSessions> sessions;

    public static DisconnectDesktopSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DisconnectDesktopSessionsRequest self = new DisconnectDesktopSessionsRequest();
        return TeaModel.build(map, self);
    }

    public DisconnectDesktopSessionsRequest setPreCheck(Boolean preCheck) {
        this.preCheck = preCheck;
        return this;
    }
    public Boolean getPreCheck() {
        return this.preCheck;
    }

    public DisconnectDesktopSessionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisconnectDesktopSessionsRequest setSessions(java.util.List<DisconnectDesktopSessionsRequestSessions> sessions) {
        this.sessions = sessions;
        return this;
    }
    public java.util.List<DisconnectDesktopSessionsRequestSessions> getSessions() {
        return this.sessions;
    }

    public static class DisconnectDesktopSessionsRequestSessions extends TeaModel {
        /**
         * <p>The cloud desktop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-90g15fkhsxxxn0unj</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The end user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>wy01</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        public static DisconnectDesktopSessionsRequestSessions build(java.util.Map<String, ?> map) throws Exception {
            DisconnectDesktopSessionsRequestSessions self = new DisconnectDesktopSessionsRequestSessions();
            return TeaModel.build(map, self);
        }

        public DisconnectDesktopSessionsRequestSessions setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DisconnectDesktopSessionsRequestSessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

    }

}
