// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUploadInfoResponseBody extends TeaModel {
    /**
     * <p>Upload authorization ID.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI5t9HM*****EXQmw3DVH</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>Error code, consistent with HTTP status.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>In seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>900</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <p>Folder name.</p>
     * 
     * <strong>example:</strong>
     * <p>image/upload/xxx</p>
     */
    @NameInMap("Folder")
    public String folder;

    /**
     * <p>Upload host.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com">https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com</a></p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Key used for uploading files.</p>
     * 
     * <strong>example:</strong>
     * <p>image/upload/xxx</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>Further description of the error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>Used for front-end image upload.</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>OSS upload file Policy.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>ID assigned by the backend to uniquely identify a request. Can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Upload signature information.</p>
     * 
     * <strong>example:</strong>
     * <p>iyu7VHblYj+mEF9p46cdGOlNPAw=</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <p>Success indicator.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetUploadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadInfoResponseBody self = new GetUploadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadInfoResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GetUploadInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetUploadInfoResponseBody setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public GetUploadInfoResponseBody setFolder(String folder) {
        this.folder = folder;
        return this;
    }
    public String getFolder() {
        return this.folder;
    }

    public GetUploadInfoResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetUploadInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUploadInfoResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GetUploadInfoResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetUploadInfoResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetUploadInfoResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetUploadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUploadInfoResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetUploadInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
