// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListExchangeDownstreamBindingsRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExchangeName")
    public String exchangeName;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static ListExchangeDownstreamBindingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExchangeDownstreamBindingsRequest self = new ListExchangeDownstreamBindingsRequest();
        return TeaModel.build(map, self);
    }

    public ListExchangeDownstreamBindingsRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public ListExchangeDownstreamBindingsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListExchangeDownstreamBindingsRequest setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
        return this;
    }
    public String getExchangeName() {
        return this.exchangeName;
    }

    public ListExchangeDownstreamBindingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListExchangeDownstreamBindingsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExchangeDownstreamBindingsRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
