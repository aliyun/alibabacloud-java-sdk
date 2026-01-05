// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginClassesRequest extends TeaModel {
    @NameInMap("aliasLike")
    public String aliasLike;

    /**
     * <strong>example:</strong>
     * <p>InBound</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("excludeBuiltinAiProxy")
    public Boolean excludeBuiltinAiProxy;

    /**
     * <strong>example:</strong>
     * <p>gw-d1j8tjum1hkhxxxxxxxx</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>API</p>
     */
    @NameInMap("gatewayType")
    public String gatewayType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("installed")
    public Boolean installed;

    /**
     * <strong>example:</strong>
     * <p>oauth</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>HigressOfficial</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>Auth</p>
     */
    @NameInMap("type")
    public String type;

    public static ListPluginClassesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPluginClassesRequest self = new ListPluginClassesRequest();
        return TeaModel.build(map, self);
    }

    public ListPluginClassesRequest setAliasLike(String aliasLike) {
        this.aliasLike = aliasLike;
        return this;
    }
    public String getAliasLike() {
        return this.aliasLike;
    }

    public ListPluginClassesRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListPluginClassesRequest setExcludeBuiltinAiProxy(Boolean excludeBuiltinAiProxy) {
        this.excludeBuiltinAiProxy = excludeBuiltinAiProxy;
        return this;
    }
    public Boolean getExcludeBuiltinAiProxy() {
        return this.excludeBuiltinAiProxy;
    }

    public ListPluginClassesRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListPluginClassesRequest setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }
    public String getGatewayType() {
        return this.gatewayType;
    }

    public ListPluginClassesRequest setInstalled(Boolean installed) {
        this.installed = installed;
        return this;
    }
    public Boolean getInstalled() {
        return this.installed;
    }

    public ListPluginClassesRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListPluginClassesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPluginClassesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPluginClassesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListPluginClassesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
