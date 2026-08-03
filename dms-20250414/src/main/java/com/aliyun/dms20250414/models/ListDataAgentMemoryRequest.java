// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentMemoryRequest extends TeaModel {
    /**
     * <p>The content pattern used for fuzzy match search.</p>
     * 
     * <strong>example:</strong>
     * <p>user preference</p>
     */
    @NameInMap("ContentPattern")
    public String contentPattern;

    /**
     * <p>The current Data Management unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The source ID.</p>
     * <ul>
     * <li>If MemFrom is set to session, FromId indicates the session ID.</li>
     * <li>If MemFrom is set to user, FromId indicates the RAM user ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>8zm3**********g3yxa1</p>
     */
    @NameInMap("FromId")
    public String fromId;

    /**
     * <p>The memory source. Valid values:</p>
     * <ul>
     * <li>session: Generated from a session.</li>
     * <li>user: Edited by a user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>session</p>
     */
    @NameInMap("MemFrom")
    public String memFrom;

    /**
     * <p>The sort order for the specified sort field. Default value: desc. Valid values:</p>
     * <ul>
     * <li>asc: Ascending order.</li>
     * <li>desc: Descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The sort field. Default value: hitTimes. Valid values:</p>
     * <ul>
     * <li>hitTimes: The number of hits.</li>
     * <li>created: The creation time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hitTimes</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number. Minimum value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <p>The maximum number of entries per page. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Specifies whether to query memories in all statuses. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("QueryAll")
    public Boolean queryAll;

    public static ListDataAgentMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentMemoryRequest self = new ListDataAgentMemoryRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAgentMemoryRequest setContentPattern(String contentPattern) {
        this.contentPattern = contentPattern;
        return this;
    }
    public String getContentPattern() {
        return this.contentPattern;
    }

    public ListDataAgentMemoryRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public ListDataAgentMemoryRequest setFromId(String fromId) {
        this.fromId = fromId;
        return this;
    }
    public String getFromId() {
        return this.fromId;
    }

    public ListDataAgentMemoryRequest setMemFrom(String memFrom) {
        this.memFrom = memFrom;
        return this;
    }
    public String getMemFrom() {
        return this.memFrom;
    }

    public ListDataAgentMemoryRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDataAgentMemoryRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDataAgentMemoryRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDataAgentMemoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataAgentMemoryRequest setQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
        return this;
    }
    public Boolean getQueryAll() {
        return this.queryAll;
    }

}
