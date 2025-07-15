// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCastersRequest extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848012.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the ApsaraVideo Live console and click Production Studios in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can find the ID of the production studio in the Instance ID/Name column.</p>
     * </li>
     * <li><p>If you leave this parameter empty, the data of all production studios is returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The name of the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>liveCaster****</p>
     */
    @NameInMap("CasterName")
    public String casterName;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>0: the subscription billing method</li>
     * <li>1: the pay-as-you-go billing method</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ChargeType")
    public Integer chargeType;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T11:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the production studio. Valid values:</p>
     * <ul>
     * <li>1: general mode</li>
     * <li>3: lightweight carousel playback mode</li>
     * <li>4: virtual studio</li>
     * <li>6: playlist mode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NormType")
    public String normType;

    /**
     * <p>Specifies whether to sort the production studios in ascending order based on the modification time.</p>
     * <blockquote>
     * <p> If you leave this parameter empty, the default value is used. Default value: false.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OrderByModifyAsc")
    public String orderByModifyAsc;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of templates to return on each page. If you leave this parameter empty, the default value is used. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">Resource groups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzw******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T09:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the production studio. Valid values:</p>
     * <ul>
     * <li>0: idle</li>
     * <li>1: streaming</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeCastersRequestTag> tag;

    public static DescribeCastersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCastersRequest self = new DescribeCastersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCastersRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCastersRequest setCasterName(String casterName) {
        this.casterName = casterName;
        return this;
    }
    public String getCasterName() {
        return this.casterName;
    }

    public DescribeCastersRequest setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public Integer getChargeType() {
        return this.chargeType;
    }

    public DescribeCastersRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCastersRequest setNormType(String normType) {
        this.normType = normType;
        return this;
    }
    public String getNormType() {
        return this.normType;
    }

    public DescribeCastersRequest setOrderByModifyAsc(String orderByModifyAsc) {
        this.orderByModifyAsc = orderByModifyAsc;
        return this;
    }
    public String getOrderByModifyAsc() {
        return this.orderByModifyAsc;
    }

    public DescribeCastersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCastersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeCastersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCastersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCastersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCastersRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCastersRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeCastersRequest setTag(java.util.List<DescribeCastersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCastersRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeCastersRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCastersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCastersRequestTag self = new DescribeCastersRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeCastersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCastersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
