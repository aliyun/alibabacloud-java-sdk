// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAModuleByProductResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The OTA modules returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListOTAModuleByProductResponseBodyData> data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>74C2BB8D-1D6F-41F5-AE68-6B2310883F63</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListOTAModuleByProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOTAModuleByProductResponseBody self = new ListOTAModuleByProductResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOTAModuleByProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAModuleByProductResponseBody setData(java.util.List<ListOTAModuleByProductResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOTAModuleByProductResponseBodyData> getData() {
        return this.data;
    }

    public ListOTAModuleByProductResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAModuleByProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAModuleByProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOTAModuleByProductResponseBodyData extends TeaModel {
        /**
         * <p>The alias of the OTA module.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The description of the OTA module.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The time when the OTA module was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-13T09:46Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last time when the OTA module was updated. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-19T09:46Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The name of the OTA module.</p>
         * 
         * <strong>example:</strong>
         * <p>barcodeScanner</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The ProductKey of the product.</p>
         * 
         * <strong>example:</strong>
         * <p>aluctKe****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static ListOTAModuleByProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOTAModuleByProductResponseBodyData self = new ListOTAModuleByProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOTAModuleByProductResponseBodyData setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListOTAModuleByProductResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListOTAModuleByProductResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListOTAModuleByProductResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListOTAModuleByProductResponseBodyData setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListOTAModuleByProductResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
