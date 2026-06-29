// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetTokenPlanOrgInviteConfigResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data result of the current category statistics.</p>
     */
    @NameInMap("Data")
    public GetTokenPlanOrgInviteConfigResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTokenPlanOrgInviteConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTokenPlanOrgInviteConfigResponseBody self = new GetTokenPlanOrgInviteConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTokenPlanOrgInviteConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTokenPlanOrgInviteConfigResponseBody setData(GetTokenPlanOrgInviteConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTokenPlanOrgInviteConfigResponseBodyData getData() {
        return this.data;
    }

    public GetTokenPlanOrgInviteConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTokenPlanOrgInviteConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTokenPlanOrgInviteConfigResponseBodyData extends TeaModel {
        /**
         * <p>The default organization role ID to assign. Valid values:</p>
         * <ul>
         * <li>SYSTEM_ROLE_ORG_ADMIN</li>
         * <li>SYSTEM_ROLE_ORG_MEMBER</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ORG_MEMBER</p>
         */
        @NameInMap("DefaultRoleId")
        public String defaultRoleId;

        /**
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org_123456789</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The default seat allocation strategy. Valid values:</p>
         * <ul>
         * <li>HIGH_TO_LOW</li>
         * <li>LOW_TO_HIGH </li>
         * <li>NONE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("SeatAssignStrategy")
        public String seatAssignStrategy;

        public static GetTokenPlanOrgInviteConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTokenPlanOrgInviteConfigResponseBodyData self = new GetTokenPlanOrgInviteConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTokenPlanOrgInviteConfigResponseBodyData setDefaultRoleId(String defaultRoleId) {
            this.defaultRoleId = defaultRoleId;
            return this;
        }
        public String getDefaultRoleId() {
            return this.defaultRoleId;
        }

        public GetTokenPlanOrgInviteConfigResponseBodyData setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public GetTokenPlanOrgInviteConfigResponseBodyData setSeatAssignStrategy(String seatAssignStrategy) {
            this.seatAssignStrategy = seatAssignStrategy;
            return this;
        }
        public String getSeatAssignStrategy() {
            return this.seatAssignStrategy;
        }

    }

}
