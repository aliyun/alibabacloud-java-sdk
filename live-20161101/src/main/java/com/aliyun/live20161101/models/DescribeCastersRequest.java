// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCastersRequest extends TeaModel {
    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848012.html">CreateCaster operation</a>, check the CasterId parameter returned by the CreateCaster operation.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, go to <strong>ApsaraVideo Live console &gt; Production Studios &gt; Cloud Production Studio</strong> to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The production studio name in the production studio list on the Cloud Production Studio page is the production studio ID.</li>
     * <li>If this parameter is left empty, the merged data of all production studios is returned by default.</li>
     * </ul>
     * </blockquote>
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
     * <li><p>0: PrePaid (subscription).</p>
     * </li>
     * <li><p>1: PostPaid (pay-as-you-go).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ChargeType")
    public Integer chargeType;

    /**
     * <p>The end time. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T11:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The specification type of the production studio. Valid values:</p>
     * <ul>
     * <li><p>1: general mode.</p>
     * </li>
     * <li><p>3: lightweight playlist mode.</p>
     * </li>
     * <li><p>4: virtual studio mode.</p>
     * </li>
     * <li><p>6: playlist mode (new playlist mode production studio).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NormType")
    public String normType;

    /**
     * <p>Specifies whether to sort the production studios in ascending order by modification time.</p>
     * <p>Valid values: true (ascending order by modification time) | false (descending order by modification time, which is the default value).</p>
     * <blockquote>
     * <p>If this parameter is not specified, the default value is &quot;false&quot;.</p>
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
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzw******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The start time. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2016-06-29T09:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li><p>0: idle.  </p>
     * </li>
     * <li><p>1: streaming.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The list of tags.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
