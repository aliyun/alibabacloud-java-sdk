// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class ListFundAccountResponseBody extends TeaModel {
    /**
     * <p>The data list.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListFundAccountResponseBodyData> data;

    /**
     * <p>The metadata of the response structure.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFundAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFundAccountResponseBody self = new ListFundAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFundAccountResponseBody setData(java.util.List<ListFundAccountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFundAccountResponseBodyData> getData() {
        return this.data;
    }

    public ListFundAccountResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public ListFundAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFundAccountResponseBodyData extends TeaModel {
        /**
         * <p>The time when the account was created. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-30 12:00:00</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The account ID of the MA user corresponding to the account.</p>
         * 
         * <strong>example:</strong>
         * <p>1232121</p>
         */
        @NameInMap("FundAccountAdminAccountId")
        public String fundAccountAdminAccountId;

        /**
         * <p>The username of the MA user corresponding to the account.</p>
         * 
         * <strong>example:</strong>
         * <p>Yun\&quot;s account</p>
         */
        @NameInMap("FundAccountAdminAccountName")
        public String fundAccountAdminAccountName;

        /**
         * <p>The fund account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1022231</p>
         */
        @NameInMap("FundAccountId")
        public String fundAccountId;

        /**
         * <p>The fund account name.</p>
         * 
         * <strong>example:</strong>
         * <p>Yun\&quot;s account</p>
         */
        @NameInMap("FundAccountName")
        public String fundAccountName;

        /**
         * <p>The account ID of the fund account owner.</p>
         * 
         * <strong>example:</strong>
         * <p>132123211</p>
         */
        @NameInMap("FundAccountOwnerAccountId")
        public String fundAccountOwnerAccountId;

        /**
         * <p>The account status. Valid values:</p>
         * <ul>
         * <li>VALID: Valid.</li>
         * <li>FROZEN: Frozen. </li>
         * <li>CLOSED: Closed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("FundAccountStatus")
        public String fundAccountStatus;

        /**
         * <p>The account type. Valid values:</p>
         * <ul>
         * <li>DIRECT_USER: Alibaba Cloud direct customer account. </li>
         * <li>RESELLER_QUOTA: Ecosystem account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DIRECT_USER</p>
         */
        @NameInMap("FundAccountType")
        public String fundAccountType;

        /**
         * <p>The primary marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>2684210001</p>
         */
        @NameInMap("Nbid")
        public String nbid;

        /**
         * <p>The set of account permissions owned by the user. Valid values:</p>
         * <ul>
         * <li>using: Use.</li>
         * <li>manage: Manage.</li>
         * <li>owner: Own.</li>
         * </ul>
         */
        @NameInMap("Permissions")
        public java.util.List<String> permissions;

        /**
         * <p>The site.</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Site")
        public String site;

        public static ListFundAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFundAccountResponseBodyData self = new ListFundAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFundAccountResponseBodyData setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListFundAccountResponseBodyData setFundAccountAdminAccountId(String fundAccountAdminAccountId) {
            this.fundAccountAdminAccountId = fundAccountAdminAccountId;
            return this;
        }
        public String getFundAccountAdminAccountId() {
            return this.fundAccountAdminAccountId;
        }

        public ListFundAccountResponseBodyData setFundAccountAdminAccountName(String fundAccountAdminAccountName) {
            this.fundAccountAdminAccountName = fundAccountAdminAccountName;
            return this;
        }
        public String getFundAccountAdminAccountName() {
            return this.fundAccountAdminAccountName;
        }

        public ListFundAccountResponseBodyData setFundAccountId(String fundAccountId) {
            this.fundAccountId = fundAccountId;
            return this;
        }
        public String getFundAccountId() {
            return this.fundAccountId;
        }

        public ListFundAccountResponseBodyData setFundAccountName(String fundAccountName) {
            this.fundAccountName = fundAccountName;
            return this;
        }
        public String getFundAccountName() {
            return this.fundAccountName;
        }

        public ListFundAccountResponseBodyData setFundAccountOwnerAccountId(String fundAccountOwnerAccountId) {
            this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
            return this;
        }
        public String getFundAccountOwnerAccountId() {
            return this.fundAccountOwnerAccountId;
        }

        public ListFundAccountResponseBodyData setFundAccountStatus(String fundAccountStatus) {
            this.fundAccountStatus = fundAccountStatus;
            return this;
        }
        public String getFundAccountStatus() {
            return this.fundAccountStatus;
        }

        public ListFundAccountResponseBodyData setFundAccountType(String fundAccountType) {
            this.fundAccountType = fundAccountType;
            return this;
        }
        public String getFundAccountType() {
            return this.fundAccountType;
        }

        public ListFundAccountResponseBodyData setNbid(String nbid) {
            this.nbid = nbid;
            return this;
        }
        public String getNbid() {
            return this.nbid;
        }

        public ListFundAccountResponseBodyData setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        public ListFundAccountResponseBodyData setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

    }

}
