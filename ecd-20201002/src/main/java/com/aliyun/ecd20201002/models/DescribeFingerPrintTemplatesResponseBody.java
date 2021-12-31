// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeFingerPrintTemplatesResponseBody extends TeaModel {
    @NameInMap("FingerPrintTemplates")
    public java.util.List<DescribeFingerPrintTemplatesResponseBodyFingerPrintTemplates> fingerPrintTemplates;

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
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("Index")
        public Long index;

        @NameInMap("LoginTime")
        public String loginTime;

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
