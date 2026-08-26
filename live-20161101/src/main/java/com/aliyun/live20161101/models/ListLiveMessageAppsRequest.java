// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageAppsRequest extends TeaModel {
    /**
     * <p>The data center. The value must be the same as the data center specified in <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a>. Valid values: cn-shanghai (China (Shanghai)) and ap-southeast-1 (Singapore).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The starting position of the query page. If this parameter is left empty or set to -1, the first page is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>The sort type by creation time. Valid values:</p>
     * <ul>
     * <li>1: ascending order.</li>
     * <li>2: descending order.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SortType")
    public Integer sortType;

    public static ListLiveMessageAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageAppsRequest self = new ListLiveMessageAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageAppsRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ListLiveMessageAppsRequest setNextPageToken(Long nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    public ListLiveMessageAppsRequest setSortType(Integer sortType) {
        this.sortType = sortType;
        return this;
    }
    public Integer getSortType() {
        return this.sortType;
    }

}
