// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListSkillAuthedIdentitiesResponseBody extends TeaModel {
    /**
     * <p>The list of authorized objects.</p>
     */
    @NameInMap("Identities")
    public java.util.List<ListSkillAuthedIdentitiesResponseBodyIdentities> identities;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5CC5E450-FC43-4F5B-B540-9964BD*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSkillAuthedIdentitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillAuthedIdentitiesResponseBody self = new ListSkillAuthedIdentitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillAuthedIdentitiesResponseBody setIdentities(java.util.List<ListSkillAuthedIdentitiesResponseBodyIdentities> identities) {
        this.identities = identities;
        return this;
    }
    public java.util.List<ListSkillAuthedIdentitiesResponseBodyIdentities> getIdentities() {
        return this.identities;
    }

    public ListSkillAuthedIdentitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillAuthedIdentitiesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSkillAuthedIdentitiesResponseBodyIdentities extends TeaModel {
        /**
         * <p>Indicates whether automatic installation is enabled. Valid values:</p>
         * <ul>
         * <li>true: Automatic installation is enabled.</li>
         * <li>false: Automatic installation is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoInstall")
        public Boolean autoInstall;

        /**
         * <p>The ID of the authorized object.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-b9ej3xiok4tjbgf9x****</p>
         */
        @NameInMap("IdentityId")
        public String identityId;

        public static ListSkillAuthedIdentitiesResponseBodyIdentities build(java.util.Map<String, ?> map) throws Exception {
            ListSkillAuthedIdentitiesResponseBodyIdentities self = new ListSkillAuthedIdentitiesResponseBodyIdentities();
            return TeaModel.build(map, self);
        }

        public ListSkillAuthedIdentitiesResponseBodyIdentities setAutoInstall(Boolean autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        public ListSkillAuthedIdentitiesResponseBodyIdentities setIdentityId(String identityId) {
            this.identityId = identityId;
            return this;
        }
        public String getIdentityId() {
            return this.identityId;
        }

    }

}
