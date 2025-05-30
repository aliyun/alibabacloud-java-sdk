// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetHotwordLibraryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2020-12-23T13:33:49Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <strong>example:</strong>
     * <p>热词库描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>05512043f49f697f7425</strong></strong></p>
     */
    @NameInMap("HotwordLibraryId")
    public String hotwordLibraryId;

    @NameInMap("Hotwords")
    public java.util.List<Hotword> hotwords;

    /**
     * <strong>example:</strong>
     * <p>热词库名称</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ASR</p>
     */
    @NameInMap("UsageScenario")
    public String usageScenario;

    public static GetHotwordLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotwordLibraryResponseBody self = new GetHotwordLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotwordLibraryResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public GetHotwordLibraryResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetHotwordLibraryResponseBody setHotwordLibraryId(String hotwordLibraryId) {
        this.hotwordLibraryId = hotwordLibraryId;
        return this;
    }
    public String getHotwordLibraryId() {
        return this.hotwordLibraryId;
    }

    public GetHotwordLibraryResponseBody setHotwords(java.util.List<Hotword> hotwords) {
        this.hotwords = hotwords;
        return this;
    }
    public java.util.List<Hotword> getHotwords() {
        return this.hotwords;
    }

    public GetHotwordLibraryResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetHotwordLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotwordLibraryResponseBody setUsageScenario(String usageScenario) {
        this.usageScenario = usageScenario;
        return this;
    }
    public String getUsageScenario() {
        return this.usageScenario;
    }

}
