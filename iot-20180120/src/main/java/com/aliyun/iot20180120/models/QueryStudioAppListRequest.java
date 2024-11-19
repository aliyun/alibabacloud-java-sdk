// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("FuzzyName")
    public String fuzzyName;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a123********</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;webApp&quot;, &quot;mobileApp&quot;]</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    public static QueryStudioAppListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppListRequest self = new QueryStudioAppListRequest();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppListRequest setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
        return this;
    }
    public String getFuzzyName() {
        return this.fuzzyName;
    }

    public QueryStudioAppListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryStudioAppListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryStudioAppListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryStudioAppListRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryStudioAppListRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
