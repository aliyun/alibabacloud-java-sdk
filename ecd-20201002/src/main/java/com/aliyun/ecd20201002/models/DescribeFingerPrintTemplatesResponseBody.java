// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeFingerPrintTemplatesResponseBody extends TeaModel {
    /**
     * <p>The fingerprint templates.</p>
     */
    @NameInMap("FingerPrintTemplates")
    public java.util.List<DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates> fingerPrintTemplates;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C1D3FBE-84E1-5ABB-AD98-2003AC71****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFingerPrintTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFingerPrintTemplatesResponseBody self = new DescribeFingerPrintTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFingerPrintTemplatesResponseBody setFingerPrintTemplates(java.util.List<DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates> fingerPrintTemplates) {
        this.fingerPrintTemplates = fingerPrintTemplates;
        return this;
    }
    public java.util.List<DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates> getFingerPrintTemplates() {
        return this.fingerPrintTemplates;
    }

    public DescribeFingerPrintTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates extends TeaModel {
        /**
         * <p>The client ID. The system generates a unique ID for each client.</p>
         * 
         * <strong>example:</strong>
         * <p>2258a3d5-b8f8-4d79-a221-eaecf211****</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-13T13:26:29Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Finger 1</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>liming</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The index.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The logon time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-13T13:26:29Z</p>
         */
        @NameInMap("LoginTime")
        public String loginTime;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-074949****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        public static DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates self = new DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates setLoginTime(String loginTime) {
            this.loginTime = loginTime;
            return this;
        }
        public String getLoginTime() {
            return this.loginTime;
        }

        public DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

    }

}
