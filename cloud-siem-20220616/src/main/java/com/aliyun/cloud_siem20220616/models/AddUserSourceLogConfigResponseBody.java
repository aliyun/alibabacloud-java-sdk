// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddUserSourceLogConfigResponseBody extends TeaModel {
    /**
     * <p>The return value of the request.</p>
     */
    @NameInMap("Data")
    public AddUserSourceLogConfigResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddUserSourceLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUserSourceLogConfigResponseBody self = new AddUserSourceLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUserSourceLogConfigResponseBody setData(AddUserSourceLogConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddUserSourceLogConfigResponseBodyData getData() {
        return this.data;
    }

    public AddUserSourceLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddUserSourceLogConfigResponseBodyData extends TeaModel {
        /**
         * <p>The detailed information about the SLS log.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai.siem-project.siem-logstore</p>
         */
        @NameInMap("DiplayLine")
        public String diplayLine;

        /**
         * <p>Indicates whether the details of the log collection task are returned. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Displayed")
        public Boolean displayed;

        /**
         * <p>Indicates whether the log is collected. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Imported")
        public Boolean imported;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to purchase Threat Analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXXXXX</p>
         */
        @NameInMap("MainUserId")
        public Long mainUserId;

        /**
         * <p>The code of the log.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_aegis_proc</p>
         */
        @NameInMap("SourceLogCode")
        public String sourceLogCode;

        /**
         * <p>The code of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("SourceProdCode")
        public String sourceProdCode;

        /**
         * <p>The ID of the Alibaba Cloud account for which the logs are collected.</p>
         * 
         * <strong>example:</strong>
         * <p>123XXXXXXXX</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        /**
         * <p>The name of the Alibaba Cloud account for which the logs are collected.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_account_xxx</p>
         */
        @NameInMap("SubUserName")
        public String subUserName;

        public static AddUserSourceLogConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddUserSourceLogConfigResponseBodyData self = new AddUserSourceLogConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddUserSourceLogConfigResponseBodyData setDiplayLine(String diplayLine) {
            this.diplayLine = diplayLine;
            return this;
        }
        public String getDiplayLine() {
            return this.diplayLine;
        }

        public AddUserSourceLogConfigResponseBodyData setDisplayed(Boolean displayed) {
            this.displayed = displayed;
            return this;
        }
        public Boolean getDisplayed() {
            return this.displayed;
        }

        public AddUserSourceLogConfigResponseBodyData setImported(Boolean imported) {
            this.imported = imported;
            return this;
        }
        public Boolean getImported() {
            return this.imported;
        }

        public AddUserSourceLogConfigResponseBodyData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public AddUserSourceLogConfigResponseBodyData setSourceLogCode(String sourceLogCode) {
            this.sourceLogCode = sourceLogCode;
            return this;
        }
        public String getSourceLogCode() {
            return this.sourceLogCode;
        }

        public AddUserSourceLogConfigResponseBodyData setSourceProdCode(String sourceProdCode) {
            this.sourceProdCode = sourceProdCode;
            return this;
        }
        public String getSourceProdCode() {
            return this.sourceProdCode;
        }

        public AddUserSourceLogConfigResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

        public AddUserSourceLogConfigResponseBodyData setSubUserName(String subUserName) {
            this.subUserName = subUserName;
            return this;
        }
        public String getSubUserName() {
            return this.subUserName;
        }

    }

}
