// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListUsersByProdResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListUsersByProdResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUsersByProdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersByProdResponseBody self = new ListUsersByProdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersByProdResponseBody setData(java.util.List<ListUsersByProdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUsersByProdResponseBodyData> getData() {
        return this.data;
    }

    public ListUsersByProdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUsersByProdResponseBodyData extends TeaModel {
        /**
         * <p>The code of the cloud service provider. Valid values:</p>
         * <ul>
         * <li>qcloud: Tencent Cloud.</li>
         * <li>aliyun: Alibaba Cloud.</li>
         * <li>hcloud: Huawei Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hcloud</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <p>Indicates whether the log is added to the threat analysis feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Imported")
        public Boolean imported;

        /**
         * <p>The display log code. The value varies based on your console settings.</p>
         * 
         * <strong>example:</strong>
         * <p>${siem.xxx.xxxxxxxxx}</p>
         */
        @NameInMap("LogMdsCode")
        public String logMdsCode;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXXXXX</p>
         */
        @NameInMap("MainUserId")
        public Long mainUserId;

        /**
         * <p>The log code.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_aegis_proc</p>
         */
        @NameInMap("SourceLogCode")
        public String sourceLogCode;

        /**
         * <p>The log name.</p>
         * 
         * <strong>example:</strong>
         * <p>the process startup log</p>
         */
        @NameInMap("SourceLogName")
        public String sourceLogName;

        /**
         * <p>The code of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("SourceProdCode")
        public String sourceProdCode;

        /**
         * <p>The ID of the Alibaba Cloud account for threat analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXXXX</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        /**
         * <p>The display name of the Alibaba Cloud account for threat analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_account_xxx</p>
         */
        @NameInMap("SubUserName")
        public String subUserName;

        public static ListUsersByProdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUsersByProdResponseBodyData self = new ListUsersByProdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUsersByProdResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public ListUsersByProdResponseBodyData setImported(Boolean imported) {
            this.imported = imported;
            return this;
        }
        public Boolean getImported() {
            return this.imported;
        }

        public ListUsersByProdResponseBodyData setLogMdsCode(String logMdsCode) {
            this.logMdsCode = logMdsCode;
            return this;
        }
        public String getLogMdsCode() {
            return this.logMdsCode;
        }

        public ListUsersByProdResponseBodyData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public ListUsersByProdResponseBodyData setSourceLogCode(String sourceLogCode) {
            this.sourceLogCode = sourceLogCode;
            return this;
        }
        public String getSourceLogCode() {
            return this.sourceLogCode;
        }

        public ListUsersByProdResponseBodyData setSourceLogName(String sourceLogName) {
            this.sourceLogName = sourceLogName;
            return this;
        }
        public String getSourceLogName() {
            return this.sourceLogName;
        }

        public ListUsersByProdResponseBodyData setSourceProdCode(String sourceProdCode) {
            this.sourceProdCode = sourceProdCode;
            return this;
        }
        public String getSourceProdCode() {
            return this.sourceProdCode;
        }

        public ListUsersByProdResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

        public ListUsersByProdResponseBodyData setSubUserName(String subUserName) {
            this.subUserName = subUserName;
            return this;
        }
        public String getSubUserName() {
            return this.subUserName;
        }

    }

}
