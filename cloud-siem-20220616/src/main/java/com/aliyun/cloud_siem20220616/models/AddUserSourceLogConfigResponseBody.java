// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddUserSourceLogConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddUserSourceLogConfigResponseBodyData data;

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
        @NameInMap("DiplayLine")
        public String diplayLine;

        @NameInMap("Displayed")
        public Boolean displayed;

        @NameInMap("Imported")
        public Boolean imported;

        @NameInMap("MainUserId")
        public Long mainUserId;

        @NameInMap("SourceLogCode")
        public String sourceLogCode;

        @NameInMap("SourceProdCode")
        public String sourceProdCode;

        @NameInMap("SubUserId")
        public Long subUserId;

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
