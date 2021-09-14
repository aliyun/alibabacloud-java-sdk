// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeCrossVpcInstanceResponseBody extends TeaModel {
    @NameInMap("HasDelInProcessTask")
    public Boolean hasDelInProcessTask;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HasCreateInProcessTask")
    public Boolean hasCreateInProcessTask;

    @NameInMap("Items")
    public java.util.List<DescribeCrossVpcInstanceResponseBodyItems> items;

    public static DescribeCrossVpcInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossVpcInstanceResponseBody self = new DescribeCrossVpcInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrossVpcInstanceResponseBody setHasDelInProcessTask(Boolean hasDelInProcessTask) {
        this.hasDelInProcessTask = hasDelInProcessTask;
        return this;
    }
    public Boolean getHasDelInProcessTask() {
        return this.hasDelInProcessTask;
    }

    public DescribeCrossVpcInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossVpcInstanceResponseBody setHasCreateInProcessTask(Boolean hasCreateInProcessTask) {
        this.hasCreateInProcessTask = hasCreateInProcessTask;
        return this;
    }
    public Boolean getHasCreateInProcessTask() {
        return this.hasCreateInProcessTask;
    }

    public DescribeCrossVpcInstanceResponseBody setItems(java.util.List<DescribeCrossVpcInstanceResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeCrossVpcInstanceResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeCrossVpcInstanceResponseBodyItems extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        public static DescribeCrossVpcInstanceResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossVpcInstanceResponseBodyItems self = new DescribeCrossVpcInstanceResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCrossVpcInstanceResponseBodyItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

    }

}
