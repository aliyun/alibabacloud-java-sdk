// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomizedVoicesRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <ul>
     * <li><p>The voice type. Valid values:</p>
     * <ul>
     * <li>Basic</li>
     * <li>Standard</li>
     * </ul>
     * </li>
     * <li><p>If you do not specify this parameter, the default value Basic is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListCustomizedVoicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizedVoicesRequest self = new ListCustomizedVoicesRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomizedVoicesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListCustomizedVoicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomizedVoicesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
