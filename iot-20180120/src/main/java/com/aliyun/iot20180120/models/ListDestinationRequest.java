// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDestinationRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchName")
    public String searchName;

    /**
     * <p>The actions of forwarding data to data destinations. Data is processed by using a parser script before the data is forwarded. Valid values:</p>
     * <br>
     * <p>*   **REPUBLISH**: forwards topic data to an IoT Platform communication topic.</p>
     * <p>*   **AMQP**: forwards topic data to an Advanced Message Queuing Protocol (AMQP) consumer group.</p>
     * <p>*   **DATAHUB**: forwards topic data to Alibaba Cloud DataHub for stream data processing.</p>
     * <p>*   **ONS**: forwards topic data to Message Queue for Apache RocketMQ for message distribution.</p>
     * <p>*   **MNS**: forwards topic data to Message Service (MNS) for message transmission.</p>
     * <p>*   **FC**: forwards topic data to Function Compute for event computing.</p>
     * <p>*   **OTS**: forwards topic data to Tablestore for NoSQL data storage.</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    public static ListDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDestinationRequest self = new ListDestinationRequest();
        return TeaModel.build(map, self);
    }

    public ListDestinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListDestinationRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListDestinationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDestinationRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public ListDestinationRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
