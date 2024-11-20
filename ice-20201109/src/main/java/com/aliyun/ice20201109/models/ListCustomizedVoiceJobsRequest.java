// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomizedVoiceJobsRequest extends TeaModel {
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
     * <p>The type of the human voice cloning job. Valid values:</p>
     * <ul>
     * <li>Basic</li>
     * <li>Standard</li>
     * </ul>
     * <blockquote>
     * <p>: If you do not specify this parameter, the default value Basic is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListCustomizedVoiceJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizedVoiceJobsRequest self = new ListCustomizedVoiceJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomizedVoiceJobsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListCustomizedVoiceJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomizedVoiceJobsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
