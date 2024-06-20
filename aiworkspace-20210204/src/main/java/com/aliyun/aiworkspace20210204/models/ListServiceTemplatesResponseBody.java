// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListServiceTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceTemplates")
    public java.util.List<ServiceTemplate> serviceTemplates;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListServiceTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTemplatesResponseBody self = new ListServiceTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceTemplatesResponseBody setServiceTemplates(java.util.List<ServiceTemplate> serviceTemplates) {
        this.serviceTemplates = serviceTemplates;
        return this;
    }
    public java.util.List<ServiceTemplate> getServiceTemplates() {
        return this.serviceTemplates;
    }

    public ListServiceTemplatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
