// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetMobileResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("GetMobileResultDTO")
    public GetMobileResponseBodyGetMobileResultDTO getMobileResultDTO;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8906582E-6722</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMobileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMobileResponseBody self = new GetMobileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMobileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMobileResponseBody setGetMobileResultDTO(GetMobileResponseBodyGetMobileResultDTO getMobileResultDTO) {
        this.getMobileResultDTO = getMobileResultDTO;
        return this;
    }
    public GetMobileResponseBodyGetMobileResultDTO getGetMobileResultDTO() {
        return this.getMobileResultDTO;
    }

    public GetMobileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMobileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMobileResponseBodyGetMobileResultDTO extends TeaModel {
        /**
         * <p>The phone number,</p>
         * 
         * <strong>example:</strong>
         * <p>13900001234</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        public static GetMobileResponseBodyGetMobileResultDTO build(java.util.Map<String, ?> map) throws Exception {
            GetMobileResponseBodyGetMobileResultDTO self = new GetMobileResponseBodyGetMobileResultDTO();
            return TeaModel.build(map, self);
        }

        public GetMobileResponseBodyGetMobileResultDTO setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

    }

}
