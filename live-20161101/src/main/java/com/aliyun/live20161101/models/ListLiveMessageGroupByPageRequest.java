// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupByPageRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The data center. This value must be the same as the data center specified in <a href="https://help.aliyun.com/document_detail/2848162.html">CreateLiveMessageApp</a>. Currently supported data centers are Shanghai (cn-shanghai) and Singapore (ap-southeast-1).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The group status. Default value: 0. Valid values:</p>
     * <ul>
     * <li>0: Queries all groups.</li>
     * <li>1: Queries groups that are not deleted.</li>
     * <li>2: Queries deleted groups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GroupStatus")
    public Integer groupStatus;

    /**
     * <p>The page number. Valid values: [1,10000\].</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Valid values: [1,50\].</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort order, based on group creation time. Valid values:</p>
     * <ul>
     * <li>1: Ascending order.</li>
     * <li>2: Descending order.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SortType")
    public Integer sortType;

    public static ListLiveMessageGroupByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageGroupByPageRequest self = new ListLiveMessageGroupByPageRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageGroupByPageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListLiveMessageGroupByPageRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ListLiveMessageGroupByPageRequest setGroupStatus(Integer groupStatus) {
        this.groupStatus = groupStatus;
        return this;
    }
    public Integer getGroupStatus() {
        return this.groupStatus;
    }

    public ListLiveMessageGroupByPageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLiveMessageGroupByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveMessageGroupByPageRequest setSortType(Integer sortType) {
        this.sortType = sortType;
        return this;
    }
    public Integer getSortType() {
        return this.sortType;
    }

}
