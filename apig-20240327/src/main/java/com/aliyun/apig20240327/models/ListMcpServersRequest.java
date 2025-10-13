// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListMcpServersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ApiGatewayHttpToMCP</p>
     */
    @NameInMap("createFromTypes")
    public String createFromTypes;

    /**
     * <strong>example:</strong>
     * <p>Deployed</p>
     */
    @NameInMap("deployStatuses")
    public String deployStatuses;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-co370icmjeu****</p>
     */
    @NameInMap("gatewayId")
    public String gatewayId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("nameLike")
    public String nameLike;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>RealMCP</p>
     */
    @NameInMap("type")
    public String type;

    public static ListMcpServersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcpServersRequest self = new ListMcpServersRequest();
        return TeaModel.build(map, self);
    }

    public ListMcpServersRequest setCreateFromTypes(String createFromTypes) {
        this.createFromTypes = createFromTypes;
        return this;
    }
    public String getCreateFromTypes() {
        return this.createFromTypes;
    }

    public ListMcpServersRequest setDeployStatuses(String deployStatuses) {
        this.deployStatuses = deployStatuses;
        return this;
    }
    public String getDeployStatuses() {
        return this.deployStatuses;
    }

    public ListMcpServersRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ListMcpServersRequest setNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }
    public String getNameLike() {
        return this.nameLike;
    }

    public ListMcpServersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMcpServersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMcpServersRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
