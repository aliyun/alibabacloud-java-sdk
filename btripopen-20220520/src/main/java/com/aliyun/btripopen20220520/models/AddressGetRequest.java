// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddressGetRequest extends TeaModel {
    /**
     * <p>The redirect page type. For illustrations of each page, refer to <a href="https://openapi.alibtrip.com/doc/toDocDetail?docId=4746411">How to implement SSO redirection - Appendix</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("action_type")
    public Integer actionType;

    /**
     * <p>The three-letter code of the arrival city.</p>
     * 
     * <strong>example:</strong>
     * <p>BJS</p>
     */
    @NameInMap("arr_city_code")
    public String arrCityCode;

    /**
     * <p>The arrival city name.</p>
     * 
     * <strong>example:</strong>
     * <p>北京</p>
     */
    @NameInMap("arr_city_name")
    public String arrCityName;

    /**
     * <p>The car service scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>TRAVEL</p>
     */
    @NameInMap("car_scenes_code")
    public String carScenesCode;

    /**
     * <p>The three-letter code of the departure city.</p>
     * 
     * <strong>example:</strong>
     * <p>HGH</p>
     */
    @NameInMap("dep_city_code")
    public String depCityCode;

    /**
     * <p>The departure city name.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州</p>
     */
    @NameInMap("dep_city_name")
    public String depCityName;

    /**
     * <p>The departure date.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-26</p>
     */
    @NameInMap("dep_date")
    public String depDate;

    /**
     * <p>The itinerary ID.</p>
     * <ul>
     * <li>When the redirect page is the business travel booking page (<code>action_type = 1</code>), you can optionally pass this parameter to quickly redirect to the booking page of the category associated with the itinerary.</li>
     * <li>The itinerary ID must have been submitted to the Alibaba Business Travel system through the <a href="https://openapi.alibtrip.com/doc/toDocDetail?docId=4929938">Create a business trip approval</a> operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>460e********5d78</p>
     */
    @NameInMap("itinerary_id")
    public String itineraryId;

    /**
     * <p>Specifies whether to skip the booking intermediate page.</p>
     * <ol>
     * <li>Set this parameter to 2 to skip the booking intermediate page. When skipping the intermediate page, the <strong>itinerary_id</strong> parameter is required. If this parameter is empty or set to a value other than 2, the intermediate page is not skipped.</li>
     * <li>This parameter is available when the redirect page is the <strong>H5 booking page</strong> (<code>action_type = 1</code>) and the category is <strong>flight</strong> (<code>type = 1</code>) or <strong>train</strong> (<code>type = 2</code>).</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("middle_page")
    public Integer middlePage;

    /**
     * <p>The order ID. This parameter is required when the redirect page type is the specified order details page on either platform (<code>action_type = 11 or 12</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>1002************464</p>
     */
    @NameInMap("order_Id")
    public String orderId;

    /**
     * <p>The contact phone number, typically used for car service scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>131****8888</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>Session parameters. The format must be a JSON string where both keys and values are strings.
     * Example: &quot;{\&quot;returnURL\&quot;:\&quot;<a href="https://open.alibtrip.com/%5C%5C%22%7D">https://open.alibtrip.com/\\&quot;}</a>&quot;</p>
     */
    @NameInMap("session_parameters")
    public String sessionParameters;

    /**
     * <p>The sub-enterprise ID. Pass this parameter to redirect to the business page of the specified sub-enterprise.</p>
     * <ul>
     * <li><strong>View permissions</strong>: Only enterprise administrators have view permissions.</li>
     * <li><strong>Path to obtain</strong>: Enterprise management console &gt; Parent-child account management &gt; Account management &gt; Sub-account management &gt; Company ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>btrip01******00</p>
     */
    @NameInMap("sub_corp_id")
    public String subCorpId;

    /**
     * <p>The redirect URL after Taobao account binding.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com">https://example.com</a></p>
     */
    @NameInMap("taobao_callback_url")
    public String taobaoCallbackUrl;

    /**
     * <p>The third-party approval ID.</p>
     * 
     * <strong>example:</strong>
     * <p>TP00097732</p>
     */
    @NameInMap("thirdpart_apply_id")
    public String thirdpartApplyId;

    /**
     * <p>The ID of the actual traveler (the person being booked for).</p>
     * 
     * <strong>example:</strong>
     * <p>user_1234</p>
     */
    @NameInMap("traveler_id")
    public String travelerId;

    /**
     * <p>The business type. This parameter is required when the redirect page is the <strong>booking page</strong> (<code>action_type = 1</code>) or the <strong>order view page</strong> (<code>action_type = 2</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("type")
    public Integer type;

    /**
     * <p>Specifies whether to use proxy booking mode.</p>
     * <ul>
     * <li>The proxy booking page is accessible only when this parameter is set to 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("use_booking_proxy")
    public Integer useBookingProxy;

    /**
     * <p>The employee ID. The employee must be registered in the business travel system before you pass this parameter. Otherwise, the call fails.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_1234</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static AddressGetRequest build(java.util.Map<String, ?> map) throws Exception {
        AddressGetRequest self = new AddressGetRequest();
        return TeaModel.build(map, self);
    }

    public AddressGetRequest setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }
    public Integer getActionType() {
        return this.actionType;
    }

    public AddressGetRequest setArrCityCode(String arrCityCode) {
        this.arrCityCode = arrCityCode;
        return this;
    }
    public String getArrCityCode() {
        return this.arrCityCode;
    }

    public AddressGetRequest setArrCityName(String arrCityName) {
        this.arrCityName = arrCityName;
        return this;
    }
    public String getArrCityName() {
        return this.arrCityName;
    }

    public AddressGetRequest setCarScenesCode(String carScenesCode) {
        this.carScenesCode = carScenesCode;
        return this;
    }
    public String getCarScenesCode() {
        return this.carScenesCode;
    }

    public AddressGetRequest setDepCityCode(String depCityCode) {
        this.depCityCode = depCityCode;
        return this;
    }
    public String getDepCityCode() {
        return this.depCityCode;
    }

    public AddressGetRequest setDepCityName(String depCityName) {
        this.depCityName = depCityName;
        return this;
    }
    public String getDepCityName() {
        return this.depCityName;
    }

    public AddressGetRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

    public AddressGetRequest setItineraryId(String itineraryId) {
        this.itineraryId = itineraryId;
        return this;
    }
    public String getItineraryId() {
        return this.itineraryId;
    }

    public AddressGetRequest setMiddlePage(Integer middlePage) {
        this.middlePage = middlePage;
        return this;
    }
    public Integer getMiddlePage() {
        return this.middlePage;
    }

    public AddressGetRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AddressGetRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public AddressGetRequest setSessionParameters(String sessionParameters) {
        this.sessionParameters = sessionParameters;
        return this;
    }
    public String getSessionParameters() {
        return this.sessionParameters;
    }

    public AddressGetRequest setSubCorpId(String subCorpId) {
        this.subCorpId = subCorpId;
        return this;
    }
    public String getSubCorpId() {
        return this.subCorpId;
    }

    public AddressGetRequest setTaobaoCallbackUrl(String taobaoCallbackUrl) {
        this.taobaoCallbackUrl = taobaoCallbackUrl;
        return this;
    }
    public String getTaobaoCallbackUrl() {
        return this.taobaoCallbackUrl;
    }

    public AddressGetRequest setThirdpartApplyId(String thirdpartApplyId) {
        this.thirdpartApplyId = thirdpartApplyId;
        return this;
    }
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    public AddressGetRequest setTravelerId(String travelerId) {
        this.travelerId = travelerId;
        return this;
    }
    public String getTravelerId() {
        return this.travelerId;
    }

    public AddressGetRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public AddressGetRequest setUseBookingProxy(Integer useBookingProxy) {
        this.useBookingProxy = useBookingProxy;
        return this;
    }
    public Integer getUseBookingProxy() {
        return this.useBookingProxy;
    }

    public AddressGetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
