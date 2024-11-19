// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ClearDeviceDesiredPropertyResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public ClearDeviceDesiredPropertyResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
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

    public static ClearDeviceDesiredPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearDeviceDesiredPropertyResponseBody self = new ClearDeviceDesiredPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearDeviceDesiredPropertyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClearDeviceDesiredPropertyResponseBody setData(ClearDeviceDesiredPropertyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClearDeviceDesiredPropertyResponseBodyData getData() {
        return this.data;
    }

    public ClearDeviceDesiredPropertyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ClearDeviceDesiredPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClearDeviceDesiredPropertyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ClearDeviceDesiredPropertyResponseBodyData extends TeaModel {
        /**
         * <p>The latest version of the desired values of the properties after you call this operation to delete the specified desired property values.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;temperature\&quot;:0}</p>
         */
        @NameInMap("Versions")
        public String versions;

        public static ClearDeviceDesiredPropertyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClearDeviceDesiredPropertyResponseBodyData self = new ClearDeviceDesiredPropertyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClearDeviceDesiredPropertyResponseBodyData setVersions(String versions) {
            this.versions = versions;
            return this;
        }
        public String getVersions() {
            return this.versions;
        }

    }

}
