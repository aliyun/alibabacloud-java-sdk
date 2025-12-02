// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class QueryCallbackResponseBody extends TeaModel {
    /**
     * <p>Encryption algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>SHA256</p>
     */
    @NameInMap("CryptType")
    public String cryptType;

    /**
     * <p>Whether there is an OSS detection task.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ExistsOssCheckTask")
    public Boolean existsOssCheckTask;

    /**
     * <p>Creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-30 16:30:29</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <p>Modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-03 15:20:14</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>Primary key ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Name.</p>
     * 
     * <strong>example:</strong>
     * <p>回调通知</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>ID assigned by the backend, used to uniquely identify a request. Can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result scope.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>Seed.</p>
     * 
     * <strong>example:</strong>
     * <p>cb2MysbJTAAIf6gB3u4vpIEU-1ySnnf</p>
     */
    @NameInMap("Seed")
    public String seed;

    /**
     * <p>UID.</p>
     * 
     * <strong>example:</strong>
     * <p>19964*****086772</p>
     */
    @NameInMap("Uid")
    public String uid;

    /**
     * <p>Callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyuncs.com">https://www.aliyuncs.com</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static QueryCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCallbackResponseBody self = new QueryCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCallbackResponseBody setCryptType(String cryptType) {
        this.cryptType = cryptType;
        return this;
    }
    public String getCryptType() {
        return this.cryptType;
    }

    public QueryCallbackResponseBody setExistsOssCheckTask(Boolean existsOssCheckTask) {
        this.existsOssCheckTask = existsOssCheckTask;
        return this;
    }
    public Boolean getExistsOssCheckTask() {
        return this.existsOssCheckTask;
    }

    public QueryCallbackResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryCallbackResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public QueryCallbackResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryCallbackResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCallbackResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public QueryCallbackResponseBody setSeed(String seed) {
        this.seed = seed;
        return this;
    }
    public String getSeed() {
        return this.seed;
    }

    public QueryCallbackResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public QueryCallbackResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
