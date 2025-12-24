// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateUploadAuthResponseBody extends TeaModel {
    /**
     * <p>认证的AccessId</p>
     * 
     * <strong>example:</strong>
     * <p>STS.NYgAmE3cyPoMDxtWgtwG3xxxx</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>预下载地址</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://temp.oss.aliyuncs.com/idaas_ly77wa2oexrciw5v672vizxxxx/file_import/68866d21-0ab7-450d-b9e6-5b1eafe06xxxx">https://temp.oss.aliyuncs.com/idaas_ly77wa2oexrciw5v672vizxxxx/file_import/68866d21-0ab7-450d-b9e6-5b1eafe06xxxx</a></p>
     */
    @NameInMap("DownLoadUrl")
    public String downLoadUrl;

    /**
     * <strong>example:</strong>
     * <p>eyJhbGciOiJkaXIiLCJlbmMiOiJBMjU2R0NNIiwia2lkIjoia2V5X3Z1ZWhjbmh2NWppcGhmZGJwcWpqd3dsemFhIn0..YetpxsPdqdLvAy6G.0Zy5meoTzvCuNfA_0w7E9ItY2uGu1v1BxR9i98KeHXv_P-sm9w1q0XPf5Fw.55V_jFq2t2ZHdjg5c7uxxxx</p>
     */
    @NameInMap("EncryptedKey")
    public String encryptedKey;

    /**
     * <p>过期时间</p>
     * 
     * <strong>example:</strong>
     * <p>1766470716</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <p>bucket地址host</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://temp.oss.aliyuncs.com">https://temp.oss.aliyuncs.com</a></p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>认证对应的key</p>
     * 
     * <strong>example:</strong>
     * <p>idaas-csv://idaas_ly77wa2oexrciw5v672vizxxxx
     * /file_import/68866d21-0ab7-450d-b9e6-5b1eafxxxx&quot;</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>fBLqWEvq3SbCj1cX/rtZoSPDVduOWdloOO2VN2+5Sxxxx</p>
     */
    @NameInMap("PlaintextKey")
    public String plaintextKey;

    /**
     * <p>认证的policy</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0xMi0yM1QwNjoxODozNi4zNTZaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjBdLHsiYnVja2V0IjoidGVtcC1pZGFhcy1laWFtLWNuLWhhbmd6aG91In0seyJrZXkiOiJpZGFhc19seTc3d2Eyb2V4cmNpdzV2Njcydml6eG12ZS9maWxlX2ltcG9ydC82ODg2NmQyMS0wYWI3LTQ1MGQtYjllNi01YjFlYWZlMDYzZTEifSx7Ingtb3NzLWZvcmJpZC1vdmVyd3JpdGUiOiJ0cnVlIn0seyJ4LW9zcy1vYmplY3QtYWNsIjoicHJpdmF0ZSJxxxx</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>CAISzgJ1q6Ft5B2yfSjIr5rSCtfx3rxY562mRl7Fs2che8gfpbLg1zz2IHhMfXVpA+Afv/sxlG5Q7/wdlrp6SJtIXleCZtF94oxN9h2gb4fb4wgFPgjY08/LI3OaLjKm9u2wCryLYbGwU/OpbE++5U0X6LDmdDKkckW4OJmS8/BOZcgWWQ/KBlgvRq0hRG1YpdQdKGHaONu0LxfumRCwNkdzvRdmgm4NgsbWgO/ks0aO0wehm7BO+N6gfcD9NvMBZskvD42Hu8VtbbfE3SJq7BxHybx7lqQs+02c5onEXwALs0zXbLSErIU2dlBjH68hAOtFquPgnPtzt6nJkID62421pmiSr561rumAtyikcIvBXr5RHT3LoP1LA5UhHC1UotFVgGOaCXLbtuArXptaY/JiNL/0hFEpVt7knInNpUbntINy5f5fqzNMlShqKOXTK93xGoABgfahfEFC23BhLp3NnBxnaG/psewhUfRg/wYS9oE268EST0qPq0ZvzmZjsmtbtnFL8takNDOIdutBZeb9nngkEi7tYyVcwoYBnbJ3sopnFEVozB2VO5XuRHLBkOfB+2z1zD91KtoDajJxpT295Qm0ndFALS1tCGI452yRIrCHynggxxxxx</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>认证的签名</p>
     * 
     * <strong>example:</strong>
     * <p>t3JyykEKg3kHQuUrhaXYxtboUxxxxx</p>
     */
    @NameInMap("Signature")
    public String signature;

    public static GenerateUploadAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadAuthResponseBody self = new GenerateUploadAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateUploadAuthResponseBody setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GenerateUploadAuthResponseBody setDownLoadUrl(String downLoadUrl) {
        this.downLoadUrl = downLoadUrl;
        return this;
    }
    public String getDownLoadUrl() {
        return this.downLoadUrl;
    }

    public GenerateUploadAuthResponseBody setEncryptedKey(String encryptedKey) {
        this.encryptedKey = encryptedKey;
        return this;
    }
    public String getEncryptedKey() {
        return this.encryptedKey;
    }

    public GenerateUploadAuthResponseBody setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public GenerateUploadAuthResponseBody setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GenerateUploadAuthResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GenerateUploadAuthResponseBody setPlaintextKey(String plaintextKey) {
        this.plaintextKey = plaintextKey;
        return this;
    }
    public String getPlaintextKey() {
        return this.plaintextKey;
    }

    public GenerateUploadAuthResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GenerateUploadAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateUploadAuthResponseBody setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GenerateUploadAuthResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
