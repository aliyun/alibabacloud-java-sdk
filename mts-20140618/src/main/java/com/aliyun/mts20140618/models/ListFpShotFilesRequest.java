// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListFpShotFilesRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The media files to be returned must be stored before the specified end time. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <p>This parameter is available only in the China (Beijing), China (Hangzhou), and China (Shanghai) regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-09-08T23:32:56Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the media fingerprint library whose files you want to query. You can obtain the library ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/170149.html">CreateFpShotDB</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2288c6ca184c0e47098a5b665e2a12****</p>
     */
    @NameInMap("FpDBId")
    public String fpDBId;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>ae0fd49c0840e14daf0d66a75b83****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range to query. The media files to be returned must be stored after the specified start time. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <p>This parameter is available only in the China (Beijing), China (Hangzhou), and China (Shanghai) regions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-09-01T00:00:28Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListFpShotFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFpShotFilesRequest self = new ListFpShotFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListFpShotFilesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListFpShotFilesRequest setFpDBId(String fpDBId) {
        this.fpDBId = fpDBId;
        return this;
    }
    public String getFpDBId() {
        return this.fpDBId;
    }

    public ListFpShotFilesRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListFpShotFilesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListFpShotFilesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListFpShotFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFpShotFilesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListFpShotFilesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListFpShotFilesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
