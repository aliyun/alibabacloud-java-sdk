// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class GenerateUploadFilePolicyResponseBody extends TeaModel {
    /**
     * <p>OSSAccessKeyId</p>
     * 
     * <strong>example:</strong>
     * <p>hObpgEXoca42qH3V</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAyMS0xMi0wNlQwNjoxOTowMi40MjdaIiwiY29uZGl0aW9ucyI6W1siZXEiLCIkYnVja2V0IiwibXNlYS1jYWlzaHVpIl1dfQ==</p>
     */
    @NameInMap("EncodedPolicy")
    public String encodedPolicy;

    /**
     * <strong>example:</strong>
     * <p>1638169824405</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <strong>example:</strong>
     * <p>company_apply_card/company_change_city/1577930895198750/1638170049657</p>
     */
    @NameInMap("FileDir")
    public String fileDir;

    /**
     * <strong>example:</strong>
     * <p>https://</p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>OSS Endpoint。</p>
     * 
     * <strong>example:</strong>
     * <p>//companyapply.oss-cn-zhangjiakou.aliyuncs.com/</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>EB809CAB-82F7-5843-A42F-356770CD4914</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>jykxhmskIF24sLlxc1GafU/eQMU=</p>
     */
    @NameInMap("Signature")
    public String signature;

    public static GenerateUploadFilePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadFilePolicyResponseBody self = new GenerateUploadFilePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUploadFilePolicyResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GenerateUploadFilePolicyResponseBody setEncodedPolicy(String encodedPolicy) {
        this.encodedPolicy = encodedPolicy;
        return this;
    }
    public String getEncodedPolicy() {
        return this.encodedPolicy;
    }

    public GenerateUploadFilePolicyResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public GenerateUploadFilePolicyResponseBody setFileDir(String fileDir) {
        this.fileDir = fileDir;
        return this;
    }
    public String getFileDir() {
        return this.fileDir;
    }

    public GenerateUploadFilePolicyResponseBody setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public GenerateUploadFilePolicyResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GenerateUploadFilePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUploadFilePolicyResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
